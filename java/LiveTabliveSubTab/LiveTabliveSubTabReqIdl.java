package tbclient.LiveTabliveSubTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class LiveTabliveSubTabReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private LiveTabliveSubTabReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveTabliveSubTabReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(LiveTabliveSubTabReqIdl liveTabliveSubTabReqIdl) {
            super(liveTabliveSubTabReqIdl);
            if (liveTabliveSubTabReqIdl != null) {
                this.data = liveTabliveSubTabReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveTabliveSubTabReqIdl build(boolean z) {
            return new LiveTabliveSubTabReqIdl(this, z);
        }
    }
}
