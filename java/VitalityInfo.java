package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class VitalityInfo extends Message {
    @ProtoField(tag = 1)
    public final FrequentlyForumInfo frequently_forum_info;

    /* synthetic */ VitalityInfo(Builder builder, boolean z, VitalityInfo vitalityInfo) {
        this(builder, z);
    }

    private VitalityInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.frequently_forum_info = builder.frequently_forum_info;
        } else {
            this.frequently_forum_info = builder.frequently_forum_info;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<VitalityInfo> {
        public FrequentlyForumInfo frequently_forum_info;

        public Builder() {
        }

        public Builder(VitalityInfo vitalityInfo) {
            super(vitalityInfo);
            if (vitalityInfo != null) {
                this.frequently_forum_info = vitalityInfo.frequently_forum_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VitalityInfo build(boolean z) {
            return new VitalityInfo(this, z, null);
        }
    }
}
