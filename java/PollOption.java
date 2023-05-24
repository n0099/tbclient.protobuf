package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PollOption extends Message {
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String text;
    public static final Integer DEFAULT_ID = 0;
    public static final Long DEFAULT_NUM = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PollOption> {
        public Integer id;
        public String image;
        public Long num;
        public String text;

        public Builder() {
        }

        public Builder(PollOption pollOption) {
            super(pollOption);
            if (pollOption == null) {
                return;
            }
            this.id = pollOption.id;
            this.num = pollOption.num;
            this.text = pollOption.text;
            this.image = pollOption.image;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PollOption build(boolean z) {
            return new PollOption(this, z);
        }
    }

    public PollOption(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            Long l = builder.num;
            if (l == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = l;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.image;
            if (str2 == null) {
                this.image = "";
                return;
            } else {
                this.image = str2;
                return;
            }
        }
        this.id = builder.id;
        this.num = builder.num;
        this.text = builder.text;
        this.image = builder.image;
    }
}
