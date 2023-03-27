package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class PicInfo extends Message {
    public static final String DEFAULT_BIG_PIC_URL = "";
    public static final Double DEFAULT_CROP_POINT_HEIGHT_RATIO;
    public static final Double DEFAULT_CROP_POINT_WIDTH_RATIO;
    public static final String DEFAULT_ORIGIN_PIC_URL = "";
    public static final String DEFAULT_SMALL_PIC_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String big_pic_url;
    @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
    public final Double crop_point_height_ratio;
    @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
    public final Double crop_point_width_ratio;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer height;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer is_long_pic;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String origin_pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String small_pic_url;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer width;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_IS_LONG_PIC = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PicInfo> {
        public String big_pic_url;
        public Double crop_point_height_ratio;
        public Double crop_point_width_ratio;
        public Integer height;
        public Integer is_long_pic;
        public String origin_pic_url;
        public String small_pic_url;
        public Integer width;

        public Builder() {
        }

        public Builder(PicInfo picInfo) {
            super(picInfo);
            if (picInfo == null) {
                return;
            }
            this.small_pic_url = picInfo.small_pic_url;
            this.big_pic_url = picInfo.big_pic_url;
            this.origin_pic_url = picInfo.origin_pic_url;
            this.width = picInfo.width;
            this.height = picInfo.height;
            this.is_long_pic = picInfo.is_long_pic;
            this.crop_point_width_ratio = picInfo.crop_point_width_ratio;
            this.crop_point_height_ratio = picInfo.crop_point_height_ratio;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PicInfo build(boolean z) {
            return new PicInfo(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_CROP_POINT_WIDTH_RATIO = valueOf;
        DEFAULT_CROP_POINT_HEIGHT_RATIO = valueOf;
    }

    public PicInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.small_pic_url;
            if (str == null) {
                this.small_pic_url = "";
            } else {
                this.small_pic_url = str;
            }
            String str2 = builder.big_pic_url;
            if (str2 == null) {
                this.big_pic_url = "";
            } else {
                this.big_pic_url = str2;
            }
            String str3 = builder.origin_pic_url;
            if (str3 == null) {
                this.origin_pic_url = "";
            } else {
                this.origin_pic_url = str3;
            }
            Integer num = builder.width;
            if (num == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num;
            }
            Integer num2 = builder.height;
            if (num2 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num2;
            }
            Integer num3 = builder.is_long_pic;
            if (num3 == null) {
                this.is_long_pic = DEFAULT_IS_LONG_PIC;
            } else {
                this.is_long_pic = num3;
            }
            Double d = builder.crop_point_width_ratio;
            if (d == null) {
                this.crop_point_width_ratio = DEFAULT_CROP_POINT_WIDTH_RATIO;
            } else {
                this.crop_point_width_ratio = d;
            }
            Double d2 = builder.crop_point_height_ratio;
            if (d2 == null) {
                this.crop_point_height_ratio = DEFAULT_CROP_POINT_HEIGHT_RATIO;
                return;
            } else {
                this.crop_point_height_ratio = d2;
                return;
            }
        }
        this.small_pic_url = builder.small_pic_url;
        this.big_pic_url = builder.big_pic_url;
        this.origin_pic_url = builder.origin_pic_url;
        this.width = builder.width;
        this.height = builder.height;
        this.is_long_pic = builder.is_long_pic;
        this.crop_point_width_ratio = builder.crop_point_width_ratio;
        this.crop_point_height_ratio = builder.crop_point_height_ratio;
    }
}
