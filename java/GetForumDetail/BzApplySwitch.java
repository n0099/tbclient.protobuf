package tbclient.GetForumDetail;

import com.squareup.wire.Message;
/* loaded from: classes2.dex */
public final class BzApplySwitch extends Message {

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BzApplySwitch> {
        public Builder() {
        }

        public Builder(BzApplySwitch bzApplySwitch) {
            super(bzApplySwitch);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BzApplySwitch build(boolean z) {
            return new BzApplySwitch(this, z);
        }
    }

    public BzApplySwitch(Builder builder, boolean z) {
        super(builder);
    }
}
