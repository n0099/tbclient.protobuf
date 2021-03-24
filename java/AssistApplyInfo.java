package tbclient;

import com.squareup.wire.Message;
/* loaded from: classes7.dex */
public final class AssistApplyInfo extends Message {

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AssistApplyInfo> {
        public Builder() {
        }

        public Builder(AssistApplyInfo assistApplyInfo) {
            super(assistApplyInfo);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AssistApplyInfo build(boolean z) {
            return new AssistApplyInfo(this, z);
        }
    }

    public AssistApplyInfo(Builder builder, boolean z) {
        super(builder);
    }
}
