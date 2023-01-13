package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class Toast extends Message {
    public static final String DEFAULT_BACKGROUND = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String background;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ToastContent> content;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer icon_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_ICON_TYPE = 0;
    public static final List<ToastContent> DEFAULT_CONTENT = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Toast> {
        public String background;
        public List<ToastContent> content;
        public Integer icon_type;
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
                return;
            } else {
                this.background = str2;
                return;
            }
        }
        this.icon_type = builder.icon_type;
        this.content = Message.immutableCopyOf(builder.content);
        this.url = builder.url;
        this.background = builder.background;
    }
}
