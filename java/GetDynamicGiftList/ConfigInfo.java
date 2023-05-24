package tbclient.GetDynamicGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ConfigInfo extends Message {
    public static final Double DEFAULT_HEIGHT;
    public static final Double DEFAULT_OPPOSITE_X;
    public static final Double DEFAULT_OPPOSITE_Y;
    public static final Double DEFAULT_USER_INFO_X;
    public static final Double DEFAULT_USER_INFO_Y;
    public static final Double DEFAULT_WIDTH;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer frame_count;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer frame_rate;
    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double height;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_bottom_margin;
    @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
    public final Double opposite_x;
    @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
    public final Double opposite_y;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer repeat_count;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double user_info_x;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double user_info_y;
    @ProtoField(tag = 5, type = Message.Datatype.DOUBLE)
    public final Double width;
    public static final Integer DEFAULT_FRAME_RATE = 0;
    public static final Integer DEFAULT_FRAME_COUNT = 0;
    public static final Integer DEFAULT_REPEAT_COUNT = 0;
    public static final Integer DEFAULT_IS_BOTTOM_MARGIN = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ConfigInfo> {
        public Integer frame_count;
        public Integer frame_rate;
        public Double height;
        public Integer is_bottom_margin;
        public Double opposite_x;
        public Double opposite_y;
        public Integer repeat_count;
        public Double user_info_x;
        public Double user_info_y;
        public Double width;

        public Builder() {
        }

        public Builder(ConfigInfo configInfo) {
            super(configInfo);
            if (configInfo == null) {
                return;
            }
            this.frame_rate = configInfo.frame_rate;
            this.frame_count = configInfo.frame_count;
            this.repeat_count = configInfo.repeat_count;
            this.is_bottom_margin = configInfo.is_bottom_margin;
            this.width = configInfo.width;
            this.height = configInfo.height;
            this.opposite_x = configInfo.opposite_x;
            this.opposite_y = configInfo.opposite_y;
            this.user_info_x = configInfo.user_info_x;
            this.user_info_y = configInfo.user_info_y;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConfigInfo build(boolean z) {
            return new ConfigInfo(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_WIDTH = valueOf;
        DEFAULT_HEIGHT = valueOf;
        DEFAULT_OPPOSITE_X = valueOf;
        DEFAULT_OPPOSITE_Y = valueOf;
        DEFAULT_USER_INFO_X = valueOf;
        DEFAULT_USER_INFO_Y = valueOf;
    }

    public ConfigInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.frame_rate;
            if (num == null) {
                this.frame_rate = DEFAULT_FRAME_RATE;
            } else {
                this.frame_rate = num;
            }
            Integer num2 = builder.frame_count;
            if (num2 == null) {
                this.frame_count = DEFAULT_FRAME_COUNT;
            } else {
                this.frame_count = num2;
            }
            Integer num3 = builder.repeat_count;
            if (num3 == null) {
                this.repeat_count = DEFAULT_REPEAT_COUNT;
            } else {
                this.repeat_count = num3;
            }
            Integer num4 = builder.is_bottom_margin;
            if (num4 == null) {
                this.is_bottom_margin = DEFAULT_IS_BOTTOM_MARGIN;
            } else {
                this.is_bottom_margin = num4;
            }
            Double d = builder.width;
            if (d == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = d;
            }
            Double d2 = builder.height;
            if (d2 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = d2;
            }
            Double d3 = builder.opposite_x;
            if (d3 == null) {
                this.opposite_x = DEFAULT_OPPOSITE_X;
            } else {
                this.opposite_x = d3;
            }
            Double d4 = builder.opposite_y;
            if (d4 == null) {
                this.opposite_y = DEFAULT_OPPOSITE_Y;
            } else {
                this.opposite_y = d4;
            }
            Double d5 = builder.user_info_x;
            if (d5 == null) {
                this.user_info_x = DEFAULT_USER_INFO_X;
            } else {
                this.user_info_x = d5;
            }
            Double d6 = builder.user_info_y;
            if (d6 == null) {
                this.user_info_y = DEFAULT_USER_INFO_Y;
                return;
            } else {
                this.user_info_y = d6;
                return;
            }
        }
        this.frame_rate = builder.frame_rate;
        this.frame_count = builder.frame_count;
        this.repeat_count = builder.repeat_count;
        this.is_bottom_margin = builder.is_bottom_margin;
        this.width = builder.width;
        this.height = builder.height;
        this.opposite_x = builder.opposite_x;
        this.opposite_y = builder.opposite_y;
        this.user_info_x = builder.user_info_x;
        this.user_info_y = builder.user_info_y;
    }
}
