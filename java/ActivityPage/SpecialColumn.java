package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SpecialColumn extends Message {
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer agree_num;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer freq_num;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long live_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Integer DEFAULT_FREQ_NUM = 0;
    public static final Integer DEFAULT_AGREE_NUM = 0;

    private SpecialColumn(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.live_id == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = builder.live_id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.image == null) {
                this.image = "";
            } else {
                this.image = builder.image;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.freq_num == null) {
                this.freq_num = DEFAULT_FREQ_NUM;
            } else {
                this.freq_num = builder.freq_num;
            }
            if (builder.agree_num == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
                return;
            } else {
                this.agree_num = builder.agree_num;
                return;
            }
        }
        this.type = builder.type;
        this.thread_id = builder.thread_id;
        this.live_id = builder.live_id;
        this.title = builder.title;
        this.image = builder.image;
        this.text = builder.text;
        this.freq_num = builder.freq_num;
        this.agree_num = builder.agree_num;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SpecialColumn> {
        public Integer agree_num;
        public Integer freq_num;
        public String image;
        public Long live_id;
        public String text;
        public Long thread_id;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(SpecialColumn specialColumn) {
            super(specialColumn);
            if (specialColumn != null) {
                this.type = specialColumn.type;
                this.thread_id = specialColumn.thread_id;
                this.live_id = specialColumn.live_id;
                this.title = specialColumn.title;
                this.image = specialColumn.image;
                this.text = specialColumn.text;
                this.freq_num = specialColumn.freq_num;
                this.agree_num = specialColumn.agree_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpecialColumn build(boolean z) {
            return new SpecialColumn(this, z);
        }
    }
}
