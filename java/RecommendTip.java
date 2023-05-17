package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class RecommendTip extends Message {
    public static final String DEFAULT_IS_FOLLOW = "";
    public static final String DEFAULT_REASON = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String is_follow;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String reason;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecommendTip> {
        public String is_follow;
        public String reason;

        public Builder() {
        }

        public Builder(RecommendTip recommendTip) {
            super(recommendTip);
            if (recommendTip == null) {
                return;
            }
            this.reason = recommendTip.reason;
            this.is_follow = recommendTip.is_follow;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendTip build(boolean z) {
            return new RecommendTip(this, z);
        }
    }

    public RecommendTip(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.reason;
            if (str == null) {
                this.reason = "";
            } else {
                this.reason = str;
            }
            String str2 = builder.is_follow;
            if (str2 == null) {
                this.is_follow = "";
                return;
            } else {
                this.is_follow = str2;
                return;
            }
        }
        this.reason = builder.reason;
        this.is_follow = builder.is_follow;
    }
}
