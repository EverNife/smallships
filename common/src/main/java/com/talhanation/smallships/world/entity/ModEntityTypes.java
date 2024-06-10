package com.talhanation.smallships.world.entity;

import com.talhanation.smallships.world.entity.projectile.CannonBallEntity;
import com.talhanation.smallships.world.entity.ship.BriggEntity;
import com.talhanation.smallships.world.entity.ship.CogEntity;
import com.talhanation.smallships.world.entity.ship.DrakkarEntity;
import com.talhanation.smallships.world.entity.ship.GalleyEntity;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

public class ModEntityTypes {
    public static final EntityType<CannonBallEntity> CANNON_BALL = getEntityType(CannonBallEntity.class);
    public static final EntityType<CogEntity> COG = getEntityType(CogEntity.class);
    public static final EntityType<BriggEntity> BRIGG = getEntityType(BriggEntity.class);
    public static final EntityType<GalleyEntity> GALLEY = getEntityType(GalleyEntity.class);
    public static final EntityType<DrakkarEntity> DRAKKAR = getEntityType(DrakkarEntity.class);

    @ExpectPlatform
    public static <T extends Entity> EntityType<T> getEntityType(Class<T> entityClass) {
        throw new AssertionError();
    }
}
