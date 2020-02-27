package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ScoreInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer endtime;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer score;
    public static final Integer DEFAULT_SCORE = 0;
    public static final Integer DEFAULT_ENDTIME = 0;

    private ScoreInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.score == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = builder.score;
            }
            if (builder.endtime == null) {
                this.endtime = DEFAULT_ENDTIME;
                return;
            } else {
                this.endtime = builder.endtime;
                return;
            }
        }
        this.score = builder.score;
        this.endtime = builder.endtime;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ScoreInfo> {
        public Integer endtime;
        public Integer score;

        public Builder() {
        }

        public Builder(ScoreInfo scoreInfo) {
            super(scoreInfo);
            if (scoreInfo != null) {
                this.score = scoreInfo.score;
                this.endtime = scoreInfo.endtime;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ScoreInfo build(boolean z) {
            return new ScoreInfo(this, z);
        }
    }
}
