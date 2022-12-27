package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class RewardMaterial extends Message {
    public static final String DEFAULT_ICON = "";
    public static final Integer DEFAULT_IS_MATCHED = 0;
    public static final Integer DEFAULT_IS_NEWEST_MATCHED_LEVEL = 0;
    public static final String DEFAULT_UNLOCK_LEVEL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_matched;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_newest_matched_level;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String unlock_level;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RewardMaterial> {
        public String icon;
        public Integer is_matched;
        public Integer is_newest_matched_level;
        public String unlock_level;

        public Builder() {
        }

        public Builder(RewardMaterial rewardMaterial) {
            super(rewardMaterial);
            if (rewardMaterial == null) {
                return;
            }
            this.icon = rewardMaterial.icon;
            this.unlock_level = rewardMaterial.unlock_level;
            this.is_matched = rewardMaterial.is_matched;
            this.is_newest_matched_level = rewardMaterial.is_newest_matched_level;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RewardMaterial build(boolean z) {
            return new RewardMaterial(this, z);
        }
    }

    public RewardMaterial(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.unlock_level;
            if (str2 == null) {
                this.unlock_level = "";
            } else {
                this.unlock_level = str2;
            }
            Integer num = builder.is_matched;
            if (num == null) {
                this.is_matched = DEFAULT_IS_MATCHED;
            } else {
                this.is_matched = num;
            }
            Integer num2 = builder.is_newest_matched_level;
            if (num2 == null) {
                this.is_newest_matched_level = DEFAULT_IS_NEWEST_MATCHED_LEVEL;
                return;
            } else {
                this.is_newest_matched_level = num2;
                return;
            }
        }
        this.icon = builder.icon;
        this.unlock_level = builder.unlock_level;
        this.is_matched = builder.is_matched;
        this.is_newest_matched_level = builder.is_newest_matched_level;
    }
}
