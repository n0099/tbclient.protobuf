package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;
/* loaded from: classes2.dex */
public final class MemberBroadcastInfo extends Message {
    public static final String DEFAULT_BACKGROUND_SRC = "";
    public static final String DEFAULT_BTN_BACKGROUND_COLOR = "";
    public static final String DEFAULT_BTN_TEXT_COLOR = "";
    public static final String DEFAULT_LEFT_ICON_SRC = "";
    public static final String DEFAULT_RIGHT_BTN_TEXT = "";
    public static final String DEFAULT_RIGHT_BTN_URL = "";
    public static final String DEFAULT_TEXT_COLOR = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String background_src;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer broadcast_type;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String btn_background_color;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String btn_text_color;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer daily_max_num;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer daily_min_step;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer left_icon_height;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String left_icon_src;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer left_icon_width;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<PbContent> middle_content;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer om_max_num;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer om_min_step;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String right_btn_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String right_btn_url;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer scene_condition;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer show_time;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String text_color;
    public static final Integer DEFAULT_LEFT_ICON_WIDTH = 0;
    public static final Integer DEFAULT_LEFT_ICON_HEIGHT = 0;
    public static final List<PbContent> DEFAULT_MIDDLE_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_BROADCAST_TYPE = 0;
    public static final Integer DEFAULT_DAILY_MIN_STEP = 0;
    public static final Integer DEFAULT_DAILY_MAX_NUM = 0;
    public static final Integer DEFAULT_OM_MIN_STEP = 0;
    public static final Integer DEFAULT_OM_MAX_NUM = 0;
    public static final Integer DEFAULT_SCENE_CONDITION = 0;
    public static final Integer DEFAULT_SHOW_TIME = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<MemberBroadcastInfo> {
        public String background_src;
        public Integer broadcast_type;
        public String btn_background_color;
        public String btn_text_color;
        public Integer daily_max_num;
        public Integer daily_min_step;
        public Integer left_icon_height;
        public String left_icon_src;
        public Integer left_icon_width;
        public List<PbContent> middle_content;
        public Integer om_max_num;
        public Integer om_min_step;
        public String right_btn_text;
        public String right_btn_url;
        public Integer scene_condition;
        public Integer show_time;
        public String text_color;

        public Builder() {
        }

        public Builder(MemberBroadcastInfo memberBroadcastInfo) {
            super(memberBroadcastInfo);
            if (memberBroadcastInfo == null) {
                return;
            }
            this.left_icon_src = memberBroadcastInfo.left_icon_src;
            this.left_icon_width = memberBroadcastInfo.left_icon_width;
            this.left_icon_height = memberBroadcastInfo.left_icon_height;
            this.background_src = memberBroadcastInfo.background_src;
            this.middle_content = Message.copyOf(memberBroadcastInfo.middle_content);
            this.right_btn_text = memberBroadcastInfo.right_btn_text;
            this.right_btn_url = memberBroadcastInfo.right_btn_url;
            this.text_color = memberBroadcastInfo.text_color;
            this.broadcast_type = memberBroadcastInfo.broadcast_type;
            this.daily_min_step = memberBroadcastInfo.daily_min_step;
            this.daily_max_num = memberBroadcastInfo.daily_max_num;
            this.om_min_step = memberBroadcastInfo.om_min_step;
            this.om_max_num = memberBroadcastInfo.om_max_num;
            this.scene_condition = memberBroadcastInfo.scene_condition;
            this.show_time = memberBroadcastInfo.show_time;
            this.btn_text_color = memberBroadcastInfo.btn_text_color;
            this.btn_background_color = memberBroadcastInfo.btn_background_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemberBroadcastInfo build(boolean z) {
            return new MemberBroadcastInfo(this, z);
        }
    }

    public MemberBroadcastInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.left_icon_src;
            if (str == null) {
                this.left_icon_src = "";
            } else {
                this.left_icon_src = str;
            }
            Integer num = builder.left_icon_width;
            if (num == null) {
                this.left_icon_width = DEFAULT_LEFT_ICON_WIDTH;
            } else {
                this.left_icon_width = num;
            }
            Integer num2 = builder.left_icon_height;
            if (num2 == null) {
                this.left_icon_height = DEFAULT_LEFT_ICON_HEIGHT;
            } else {
                this.left_icon_height = num2;
            }
            String str2 = builder.background_src;
            if (str2 == null) {
                this.background_src = "";
            } else {
                this.background_src = str2;
            }
            List<PbContent> list = builder.middle_content;
            if (list == null) {
                this.middle_content = DEFAULT_MIDDLE_CONTENT;
            } else {
                this.middle_content = Message.immutableCopyOf(list);
            }
            String str3 = builder.right_btn_text;
            if (str3 == null) {
                this.right_btn_text = "";
            } else {
                this.right_btn_text = str3;
            }
            String str4 = builder.right_btn_url;
            if (str4 == null) {
                this.right_btn_url = "";
            } else {
                this.right_btn_url = str4;
            }
            String str5 = builder.text_color;
            if (str5 == null) {
                this.text_color = "";
            } else {
                this.text_color = str5;
            }
            Integer num3 = builder.broadcast_type;
            if (num3 == null) {
                this.broadcast_type = DEFAULT_BROADCAST_TYPE;
            } else {
                this.broadcast_type = num3;
            }
            Integer num4 = builder.daily_min_step;
            if (num4 == null) {
                this.daily_min_step = DEFAULT_DAILY_MIN_STEP;
            } else {
                this.daily_min_step = num4;
            }
            Integer num5 = builder.daily_max_num;
            if (num5 == null) {
                this.daily_max_num = DEFAULT_DAILY_MAX_NUM;
            } else {
                this.daily_max_num = num5;
            }
            Integer num6 = builder.om_min_step;
            if (num6 == null) {
                this.om_min_step = DEFAULT_OM_MIN_STEP;
            } else {
                this.om_min_step = num6;
            }
            Integer num7 = builder.om_max_num;
            if (num7 == null) {
                this.om_max_num = DEFAULT_OM_MAX_NUM;
            } else {
                this.om_max_num = num7;
            }
            Integer num8 = builder.scene_condition;
            if (num8 == null) {
                this.scene_condition = DEFAULT_SCENE_CONDITION;
            } else {
                this.scene_condition = num8;
            }
            Integer num9 = builder.show_time;
            if (num9 == null) {
                this.show_time = DEFAULT_SHOW_TIME;
            } else {
                this.show_time = num9;
            }
            String str6 = builder.btn_text_color;
            if (str6 == null) {
                this.btn_text_color = "";
            } else {
                this.btn_text_color = str6;
            }
            String str7 = builder.btn_background_color;
            if (str7 == null) {
                this.btn_background_color = "";
                return;
            } else {
                this.btn_background_color = str7;
                return;
            }
        }
        this.left_icon_src = builder.left_icon_src;
        this.left_icon_width = builder.left_icon_width;
        this.left_icon_height = builder.left_icon_height;
        this.background_src = builder.background_src;
        this.middle_content = Message.immutableCopyOf(builder.middle_content);
        this.right_btn_text = builder.right_btn_text;
        this.right_btn_url = builder.right_btn_url;
        this.text_color = builder.text_color;
        this.broadcast_type = builder.broadcast_type;
        this.daily_min_step = builder.daily_min_step;
        this.daily_max_num = builder.daily_max_num;
        this.om_min_step = builder.om_min_step;
        this.om_max_num = builder.om_max_num;
        this.scene_condition = builder.scene_condition;
        this.show_time = builder.show_time;
        this.btn_text_color = builder.btn_text_color;
        this.btn_background_color = builder.btn_background_color;
    }
}
