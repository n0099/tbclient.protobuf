package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class OperationColumn extends Message {
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer agree_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer freq_num;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long live_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Integer DEFAULT_FREQ_NUM = 0;
    public static final Integer DEFAULT_AGREE_NUM = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<OperationColumn> {
        public Integer agree_num;
        public Integer freq_num;
        public String image;
        public Long live_id;
        public Long thread_id;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(OperationColumn operationColumn) {
            super(operationColumn);
            if (operationColumn == null) {
                return;
            }
            this.type = operationColumn.type;
            this.thread_id = operationColumn.thread_id;
            this.live_id = operationColumn.live_id;
            this.title = operationColumn.title;
            this.image = operationColumn.image;
            this.freq_num = operationColumn.freq_num;
            this.agree_num = operationColumn.agree_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OperationColumn build(boolean z) {
            return new OperationColumn(this, z);
        }
    }

    public OperationColumn(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.live_id;
            if (l2 == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.image;
            if (str2 == null) {
                this.image = "";
            } else {
                this.image = str2;
            }
            Integer num2 = builder.freq_num;
            if (num2 == null) {
                this.freq_num = DEFAULT_FREQ_NUM;
            } else {
                this.freq_num = num2;
            }
            Integer num3 = builder.agree_num;
            if (num3 == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
                return;
            } else {
                this.agree_num = num3;
                return;
            }
        }
        this.type = builder.type;
        this.thread_id = builder.thread_id;
        this.live_id = builder.live_id;
        this.title = builder.title;
        this.image = builder.image;
        this.freq_num = builder.freq_num;
        this.agree_num = builder.agree_num;
    }
}
