package twilightforest.entity;

import codechicken.lib.math.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySteelleaf extends EntityThrowable {
    public EntitySteelleaf(World p_i1759_1_)
    {
        super(p_i1759_1_);
    }

    public EntitySteelleaf(World world, EntityLivingBase thrower)
    {
        super(world, thrower);

        randomizeVelocity();

        motionX /= 2.5;
        motionY /= 2.5;
        motionZ /= 2.5;
    }

    // from CodeChickenLib
    double approachLinear(double a, double b, double max) {
        return (a > b) ? (a - b < max ? b : a - max) : (b - a < max ? b : a + max);
    }

    public void randomizeVelocity() {
        boolean negX = motionX > 0 && motionZ < 0;
        boolean negZ = motionX < 0 && motionZ > 0;
        /*if (motionX < 0 && motionY > 0) {
            //keep y positive
        } else if (motionX > 0 && motionY < 0) {
            //keep x positive
        }*/
        if (!negX && !negZ) {
            //keep one the same
            negX = rand.nextInt(2) == 0;
            negZ = !negX;
        }

        newMotionX = motionX + (negX ? -rand.nextFloat() : rand.nextFloat()) / 2;
        newMotionY = motionY + (rand.nextFloat() - 0.5F);
        newMotionZ = motionZ + (negZ ? -rand.nextFloat() : rand.nextFloat()) / 2;
    }

    double newMotionX;
    double newMotionY;
    double newMotionZ;
    @Override
    public void onUpdate()
    {
        super.onUpdate();

        if (ticksExisted % 10 == 0) {
            randomizeVelocity();
        }

        motionX = approachLinear(motionX, newMotionX, 0.025);
        motionY = approachLinear(motionY, newMotionY, 0.01);
        motionZ = approachLinear(motionZ, newMotionZ, 0.025);

        if (ticksExisted > 100) {
            this.setDead();
        }

        /*int degrees = (this.ticksExisted * 3) % 360;
        float radianAngle = degrees * 10 * (float) Math.PI / 180;

        float radius = Math.min(7.5F, (Math.max(40, ticksExisted) - 40) / 40F + 1.5F);

        float sine = MathHelper.sin(radianAngle) * radius;
        float cosine = MathHelper.cos(radianAngle) * radius;

        this.motionX = (getThrower().posX + cosine) - posX;
        this.motionY = getThrower().posY + 1 - posY;
        this.motionZ = (getThrower().posZ + sine) - posZ;*/

        // i give up
        /*double throwerX = getThrower().posX;
        double throwerZ = getThrower().posZ;

        double speed = 0.05;
        if (posX > throwerX + 1) {
            posX = throwerX + 1;
            motionX = 0;
            motionZ = speed;
        } else if (posZ > throwerZ + 1) {
            posZ = throwerZ + 1;
            motionX = -speed;
            motionZ = 0;
        } else if (posX < throwerX - 1) {
            posX = throwerX - 1;
            motionX = 0;
            motionZ = -speed;
        } else if (posZ < throwerZ - 1) {
            posZ = throwerZ - 1;
            motionX = speed;
            motionZ = 0;
        }
        // z++ -> x--
        // x-- -> z--
        // z-- -> x++
        // x++ -> z++

        //FMLLog.info(motionX + " " + motionZ);

        //motionX = targetX;
        //motionZ = targetZ;

        motionY = (getThrower().posY + 1) - posY;*/

        // i give up 2

        //moveEntity(motionX, motionY, motionZ);

        /*this.setPosition(getThrower().posX + (cossine - sine),
                            getThrower().posY + 1,
                            getThrower().posZ + (sine + cossine)
        );*/

        //
    }

    @Override
    protected float getGravityVelocity()
    {
        return 0.0F;
    }

    protected void onImpact(MovingObjectPosition p_70227_1_)
    {
        if (!this.worldObj.isRemote)
        {
            if (p_70227_1_.entityHit != null)
            {
                if (this.getThrower() instanceof EntityPlayer) {
                    p_70227_1_.entityHit.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) this.getThrower()), 3F);
                } else {
                    p_70227_1_.entityHit.attackEntityFrom(DamageSource.causeMobDamage(this.getThrower()), 3F);
                }
                if (p_70227_1_.entityHit instanceof EntityLivingBase entitylivingbase && rand.nextInt(2) == 0) {
                    entitylivingbase.addPotionEffect(new PotionEffect(Potion.poison.id, 120));
                }
            }

            this.setDead();
        }
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tagCompund) {
        super.readEntityFromNBT(tagCompund);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tagCompound) {
        super.writeEntityToNBT(tagCompound);
    }
}
