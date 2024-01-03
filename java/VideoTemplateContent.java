package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class VideoTemplateContent extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final Double DEFAULT_POSITION_TYPE;
    public static final Double DEFAULT_POSITION_X;
    public static final Double DEFAULT_POSITION_Y;
    public static final String DEFAULT_TEXT_COLOR = "";
    public static final Double DEFAULT_TEXT_SIZE;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pic_height;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pic_width;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double position_type;
    @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
    public final Double position_x;
    @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
    public final Double position_y;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long start_time;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String text_color;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double text_size;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_PIC_WIDTH = 0;
    public static final Integer DEFAULT_PIC_HEIGHT = 0;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VideoTemplateContent> {
        public String content;
        public Long end_time;
        public Integer pic_height;
        public Integer pic_width;
        public Double position_type;
        public Double position_x;
        public Double position_y;
        public Long start_time;
        public String text_color;
        public Double text_size;
        public Integer type;

        public Builder() {
        }

        public Builder(VideoTemplateContent videoTemplateContent) {
            super(videoTemplateContent);
            if (videoTemplateContent == null) {
                return;
            }
            this.content = videoTemplateContent.content;
            this.type = videoTemplateContent.type;
            this.pic_width = videoTemplateContent.pic_width;
            this.pic_height = videoTemplateContent.pic_height;
            this.start_time = videoTemplateContent.start_time;
            this.end_time = videoTemplateContent.end_time;
            this.position_x = videoTemplateContent.position_x;
            this.position_y = videoTemplateContent.position_y;
            this.position_type = videoTemplateContent.position_type;
            this.text_size = videoTemplateContent.text_size;
            this.text_color = videoTemplateContent.text_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoTemplateContent build(boolean z) {
            return new VideoTemplateContent(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_POSITION_X = valueOf;
        DEFAULT_POSITION_Y = valueOf;
        DEFAULT_POSITION_TYPE = valueOf;
        DEFAULT_TEXT_SIZE = valueOf;
    }

    public VideoTemplateContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.pic_width;
            if (num2 == null) {
                this.pic_width = DEFAULT_PIC_WIDTH;
            } else {
                this.pic_width = num2;
            }
            Integer num3 = builder.pic_height;
            if (num3 == null) {
                this.pic_height = DEFAULT_PIC_HEIGHT;
            } else {
                this.pic_height = num3;
            }
            Long l = builder.start_time;
            if (l == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l2;
            }
            Double d = builder.position_x;
            if (d == null) {
                this.position_x = DEFAULT_POSITION_X;
            } else {
                this.position_x = d;
            }
            Double d2 = builder.position_y;
            if (d2 == null) {
                this.position_y = DEFAULT_POSITION_Y;
            } else {
                this.position_y = d2;
            }
            Double d3 = builder.position_type;
            if (d3 == null) {
                this.position_type = DEFAULT_POSITION_TYPE;
            } else {
                this.position_type = d3;
            }
            Double d4 = builder.text_size;
            if (d4 == null) {
                this.text_size = DEFAULT_TEXT_SIZE;
            } else {
                this.text_size = d4;
            }
            String str2 = builder.text_color;
            if (str2 == null) {
                this.text_color = "";
                return;
            } else {
                this.text_color = str2;
                return;
            }
        }
        this.content = builder.content;
        this.type = builder.type;
        this.pic_width = builder.pic_width;
        this.pic_height = builder.pic_height;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.position_x = builder.position_x;
        this.position_y = builder.position_y;
        this.position_type = builder.position_type;
        this.text_size = builder.text_size;
        this.text_color = builder.text_color;
    }
}
