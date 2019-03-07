package tbclient.Lottery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
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

    private UserChance(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.chance_count == null) {
                this.chance_count = DEFAULT_CHANCE_COUNT;
            } else {
                this.chance_count = builder.chance_count;
            }
            if (builder.enable_get_chance == null) {
                this.enable_get_chance = DEFAULT_ENABLE_GET_CHANCE;
            } else {
                this.enable_get_chance = builder.enable_get_chance;
            }
            if (builder.regular == null) {
                this.regular = DEFAULT_REGULAR;
                return;
            } else {
                this.regular = immutableCopyOf(builder.regular);
                return;
            }
        }
        this.chance_count = builder.chance_count;
        this.enable_get_chance = builder.enable_get_chance;
        this.regular = immutableCopyOf(builder.regular);
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<UserChance> {
        public Long chance_count;
        public Long enable_get_chance;
        public List<ActRegular> regular;

        public Builder() {
        }

        public Builder(UserChance userChance) {
            super(userChance);
            if (userChance != null) {
                this.chance_count = userChance.chance_count;
                this.enable_get_chance = userChance.enable_get_chance;
                this.regular = UserChance.copyOf(userChance.regular);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserChance build(boolean z) {
            return new UserChance(this, z);
        }
    }
}
