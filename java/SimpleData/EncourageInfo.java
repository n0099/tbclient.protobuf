package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class EncourageInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer comments;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer downloads;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer score;
    public static final Integer DEFAULT_DOWNLOADS = 0;
    public static final Integer DEFAULT_COMMENTS = 0;
    public static final Integer DEFAULT_SCORE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<EncourageInfo> {
        public Integer comments;
        public Integer downloads;
        public Integer score;

        public Builder() {
        }

        public Builder(EncourageInfo encourageInfo) {
            super(encourageInfo);
            if (encourageInfo == null) {
                return;
            }
            this.downloads = encourageInfo.downloads;
            this.comments = encourageInfo.comments;
            this.score = encourageInfo.score;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EncourageInfo build(boolean z) {
            return new EncourageInfo(this, z);
        }
    }

    public EncourageInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.downloads;
            if (num == null) {
                this.downloads = DEFAULT_DOWNLOADS;
            } else {
                this.downloads = num;
            }
            Integer num2 = builder.comments;
            if (num2 == null) {
                this.comments = DEFAULT_COMMENTS;
            } else {
                this.comments = num2;
            }
            Integer num3 = builder.score;
            if (num3 == null) {
                this.score = DEFAULT_SCORE;
                return;
            } else {
                this.score = num3;
                return;
            }
        }
        this.downloads = builder.downloads;
        this.comments = builder.comments;
        this.score = builder.score;
    }
}
