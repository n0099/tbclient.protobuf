package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class TalkBallReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private TalkBallReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<TalkBallReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(TalkBallReqIdl talkBallReqIdl) {
            super(talkBallReqIdl);
            if (talkBallReqIdl != null) {
                this.data = talkBallReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TalkBallReqIdl build(boolean z) {
            return new TalkBallReqIdl(this, z);
        }
    }
}
