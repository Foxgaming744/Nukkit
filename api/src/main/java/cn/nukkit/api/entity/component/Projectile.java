package cn.nukkit.api.entity.component;

import cn.nukkit.api.entity.Entity;
import jdk.internal.jline.internal.Nullable;

import javax.annotation.Nonnull;
import java.util.Optional;

public interface Projectile extends EntityComponent {

    int getBaseDamage();

    void setBaseDamage(int baseDamage);

    @Nonnull
    Optional<Entity> getShootingEntity();

    void setShootingEntity(@Nullable Entity entity);
}
