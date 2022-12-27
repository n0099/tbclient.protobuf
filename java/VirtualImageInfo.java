package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class VirtualImageInfo extends Message {
    public static final String DEFAULT_DYNAMIC_VIRTUAL_IMAGE_URL = "";
    public static final String DEFAULT_VIRTUAL_BACKGROUND = "";
    public static final String DEFAULT_VIRTUAL_IMAGE_URL = "";
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer allow_customize;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String dynamic_virtual_image_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer image_agree_count;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_allow_agree;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer is_background_firstly;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_display;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer isset_virtual_image;
    @ProtoField(tag = 9)
    public final StateInfo personal_state;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer recent_incr_agree;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer snapshoot_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<StateInfo> state_list;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String virtual_background;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer virtual_background_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String virtual_image_url;
    public static final Integer DEFAULT_ISSET_VIRTUAL_IMAGE = 0;
    public static final Integer DEFAULT_IMAGE_AGREE_COUNT = 0;
    public static final Integer DEFAULT_IS_ALLOW_AGREE = 0;
    public static final Integer DEFAULT_VIRTUAL_BACKGROUND_TYPE = 0;
    public static final Integer DEFAULT_RECENT_INCR_AGREE = 0;
    public static final Integer DEFAULT_SNAPSHOOT_ID = 0;
    public static final List<StateInfo> DEFAULT_STATE_LIST = Collections.emptyList();
    public static final Integer DEFAULT_ALLOW_CUSTOMIZE = 0;
    public static final Integer DEFAULT_IS_DISPLAY = 0;
    public static final Integer DEFAULT_IS_BACKGROUND_FIRSTLY = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VirtualImageInfo> {
        public Integer allow_customize;
        public String dynamic_virtual_image_url;
        public Integer image_agree_count;
        public Integer is_allow_agree;
        public Integer is_background_firstly;
        public Integer is_display;
        public Integer isset_virtual_image;
        public StateInfo personal_state;
        public Integer recent_incr_agree;
        public Integer snapshoot_id;
        public List<StateInfo> state_list;
        public String virtual_background;
        public Integer virtual_background_type;
        public String virtual_image_url;

        public Builder() {
        }

        public Builder(VirtualImageInfo virtualImageInfo) {
            super(virtualImageInfo);
            if (virtualImageInfo == null) {
                return;
            }
            this.isset_virtual_image = virtualImageInfo.isset_virtual_image;
            this.virtual_image_url = virtualImageInfo.virtual_image_url;
            this.image_agree_count = virtualImageInfo.image_agree_count;
            this.is_allow_agree = virtualImageInfo.is_allow_agree;
            this.virtual_background_type = virtualImageInfo.virtual_background_type;
            this.virtual_background = virtualImageInfo.virtual_background;
            this.recent_incr_agree = virtualImageInfo.recent_incr_agree;
            this.snapshoot_id = virtualImageInfo.snapshoot_id;
            this.personal_state = virtualImageInfo.personal_state;
            this.state_list = Message.copyOf(virtualImageInfo.state_list);
            this.allow_customize = virtualImageInfo.allow_customize;
            this.is_display = virtualImageInfo.is_display;
            this.is_background_firstly = virtualImageInfo.is_background_firstly;
            this.dynamic_virtual_image_url = virtualImageInfo.dynamic_virtual_image_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VirtualImageInfo build(boolean z) {
            return new VirtualImageInfo(this, z);
        }
    }

    public VirtualImageInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.isset_virtual_image;
            if (num == null) {
                this.isset_virtual_image = DEFAULT_ISSET_VIRTUAL_IMAGE;
            } else {
                this.isset_virtual_image = num;
            }
            String str = builder.virtual_image_url;
            if (str == null) {
                this.virtual_image_url = "";
            } else {
                this.virtual_image_url = str;
            }
            Integer num2 = builder.image_agree_count;
            if (num2 == null) {
                this.image_agree_count = DEFAULT_IMAGE_AGREE_COUNT;
            } else {
                this.image_agree_count = num2;
            }
            Integer num3 = builder.is_allow_agree;
            if (num3 == null) {
                this.is_allow_agree = DEFAULT_IS_ALLOW_AGREE;
            } else {
                this.is_allow_agree = num3;
            }
            Integer num4 = builder.virtual_background_type;
            if (num4 == null) {
                this.virtual_background_type = DEFAULT_VIRTUAL_BACKGROUND_TYPE;
            } else {
                this.virtual_background_type = num4;
            }
            String str2 = builder.virtual_background;
            if (str2 == null) {
                this.virtual_background = "";
            } else {
                this.virtual_background = str2;
            }
            Integer num5 = builder.recent_incr_agree;
            if (num5 == null) {
                this.recent_incr_agree = DEFAULT_RECENT_INCR_AGREE;
            } else {
                this.recent_incr_agree = num5;
            }
            Integer num6 = builder.snapshoot_id;
            if (num6 == null) {
                this.snapshoot_id = DEFAULT_SNAPSHOOT_ID;
            } else {
                this.snapshoot_id = num6;
            }
            this.personal_state = builder.personal_state;
            List<StateInfo> list = builder.state_list;
            if (list == null) {
                this.state_list = DEFAULT_STATE_LIST;
            } else {
                this.state_list = Message.immutableCopyOf(list);
            }
            Integer num7 = builder.allow_customize;
            if (num7 == null) {
                this.allow_customize = DEFAULT_ALLOW_CUSTOMIZE;
            } else {
                this.allow_customize = num7;
            }
            Integer num8 = builder.is_display;
            if (num8 == null) {
                this.is_display = DEFAULT_IS_DISPLAY;
            } else {
                this.is_display = num8;
            }
            Integer num9 = builder.is_background_firstly;
            if (num9 == null) {
                this.is_background_firstly = DEFAULT_IS_BACKGROUND_FIRSTLY;
            } else {
                this.is_background_firstly = num9;
            }
            String str3 = builder.dynamic_virtual_image_url;
            if (str3 == null) {
                this.dynamic_virtual_image_url = "";
                return;
            } else {
                this.dynamic_virtual_image_url = str3;
                return;
            }
        }
        this.isset_virtual_image = builder.isset_virtual_image;
        this.virtual_image_url = builder.virtual_image_url;
        this.image_agree_count = builder.image_agree_count;
        this.is_allow_agree = builder.is_allow_agree;
        this.virtual_background_type = builder.virtual_background_type;
        this.virtual_background = builder.virtual_background;
        this.recent_incr_agree = builder.recent_incr_agree;
        this.snapshoot_id = builder.snapshoot_id;
        this.personal_state = builder.personal_state;
        this.state_list = Message.immutableCopyOf(builder.state_list);
        this.allow_customize = builder.allow_customize;
        this.is_display = builder.is_display;
        this.is_background_firstly = builder.is_background_firstly;
        this.dynamic_virtual_image_url = builder.dynamic_virtual_image_url;
    }
}
