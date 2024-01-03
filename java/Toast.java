package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class Toast extends Message {
    public static final String DEFAULT_BACKGROUND = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_ICON_URL_DARK = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String background;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ToastContent> content;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer hud_width;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer icon_height;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer icon_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String icon_url_dark;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer icon_width;
    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.INT32)
    public final List<Integer> task_ids;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_ICON_TYPE = 0;
    public static final List<ToastContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final List<Integer> DEFAULT_TASK_IDS = Collections.emptyList();
    public static final Integer DEFAULT_ICON_WIDTH = 0;
    public static final Integer DEFAULT_ICON_HEIGHT = 0;
    public static final Integer DEFAULT_HUD_WIDTH = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Toast> {
        public String background;
        public List<ToastContent> content;
        public Integer hud_width;
        public Integer icon_height;
        public Integer icon_type;
        public String icon_url;
        public String icon_url_dark;
        public Integer icon_width;
        public List<Integer> task_ids;
        public String url;

        public Builder() {
        }

        public Builder(Toast toast) {
            super(toast);
            if (toast == null) {
                return;
            }
            this.icon_type = toast.icon_type;
            this.content = Message.copyOf(toast.content);
            this.url = toast.url;
            this.background = toast.background;
            this.icon_url = toast.icon_url;
            this.icon_url_dark = toast.icon_url_dark;
            this.task_ids = Message.copyOf(toast.task_ids);
            this.icon_width = toast.icon_width;
            this.icon_height = toast.icon_height;
            this.hud_width = toast.hud_width;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Toast build(boolean z) {
            return new Toast(this, z);
        }
    }

    public Toast(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.icon_type;
            if (num == null) {
                this.icon_type = DEFAULT_ICON_TYPE;
            } else {
                this.icon_type = num;
            }
            List<ToastContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.background;
            if (str2 == null) {
                this.background = "";
            } else {
                this.background = str2;
            }
            String str3 = builder.icon_url;
            if (str3 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str3;
            }
            String str4 = builder.icon_url_dark;
            if (str4 == null) {
                this.icon_url_dark = "";
            } else {
                this.icon_url_dark = str4;
            }
            List<Integer> list2 = builder.task_ids;
            if (list2 == null) {
                this.task_ids = DEFAULT_TASK_IDS;
            } else {
                this.task_ids = Message.immutableCopyOf(list2);
            }
            Integer num2 = builder.icon_width;
            if (num2 == null) {
                this.icon_width = DEFAULT_ICON_WIDTH;
            } else {
                this.icon_width = num2;
            }
            Integer num3 = builder.icon_height;
            if (num3 == null) {
                this.icon_height = DEFAULT_ICON_HEIGHT;
            } else {
                this.icon_height = num3;
            }
            Integer num4 = builder.hud_width;
            if (num4 == null) {
                this.hud_width = DEFAULT_HUD_WIDTH;
                return;
            } else {
                this.hud_width = num4;
                return;
            }
        }
        this.icon_type = builder.icon_type;
        this.content = Message.immutableCopyOf(builder.content);
        this.url = builder.url;
        this.background = builder.background;
        this.icon_url = builder.icon_url;
        this.icon_url_dark = builder.icon_url_dark;
        this.task_ids = Message.immutableCopyOf(builder.task_ids);
        this.icon_width = builder.icon_width;
        this.icon_height = builder.icon_height;
        this.hud_width = builder.hud_width;
    }
}
