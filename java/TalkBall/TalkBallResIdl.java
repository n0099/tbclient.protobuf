package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class TalkBallResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private TalkBallResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TalkBallResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(TalkBallResIdl talkBallResIdl) {
            super(talkBallResIdl);
            if (talkBallResIdl != null) {
                this.error = talkBallResIdl.error;
                this.data = talkBallResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TalkBallResIdl build(boolean z) {
            return new TalkBallResIdl(this, z);
        }
    }
}
