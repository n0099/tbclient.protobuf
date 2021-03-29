package tbclient.Lottery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class UserChance extends Message {
    public static final Long DEFAULT_CHANCE_COUNT = 0L;
    public static final Long DEFAULT_ENABLE_GET_CHANCE = 0L;
    public static final List<ActRegular> DEFAULT_REGULAR = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long chance_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long enable_get_chance;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ActRegular> regular;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<UserChance> {
        public Long chance_count;
        public Long enable_get_chance;
        public List<ActRegular> regular;

        public Builder() {
        }

        public Builder(UserChance userChance) {
            super(userChance);
            if (userChance == null) {
                return;
            }
            this.chance_count = userChance.chance_count;
            this.enable_get_chance = userChance.enable_get_chance;
            this.regular = Message.copyOf(userChance.regular);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserChance build(boolean z) {
            return new UserChance(this, z);
        }
    }

    public UserChance(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.chance_count;
            if (l == null) {
                this.chance_count = DEFAULT_CHANCE_COUNT;
            } else {
                this.chance_count = l;
            }
            Long l2 = builder.enable_get_chance;
            if (l2 == null) {
                this.enable_get_chance = DEFAULT_ENABLE_GET_CHANCE;
            } else {
                this.enable_get_chance = l2;
            }
            List<ActRegular> list = builder.regular;
            if (list == null) {
                this.regular = DEFAULT_REGULAR;
                return;
            } else {
                this.regular = Message.immutableCopyOf(list);
                return;
            }
        }
        this.chance_count = builder.chance_count;
        this.enable_get_chance = builder.enable_get_chance;
        this.regular = Message.immutableCopyOf(builder.regular);
    }
}
