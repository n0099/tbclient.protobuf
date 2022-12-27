package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class WindowToast extends Message {
    public static final String DEFAULT_TOAST_CONTENT = "";
    public static final String DEFAULT_TOAST_LINK = "";
    public static final Integer DEFAULT_TOAST_TYPE = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String toast_content;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String toast_link;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer toast_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<WindowToast> {
        public String toast_content;
        public String toast_link;
        public Integer toast_type;

        public Builder() {
        }

        public Builder(WindowToast windowToast) {
            super(windowToast);
            if (windowToast == null) {
                return;
            }
            this.toast_type = windowToast.toast_type;
            this.toast_link = windowToast.toast_link;
            this.toast_content = windowToast.toast_content;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WindowToast build(boolean z) {
            return new WindowToast(this, z);
        }
    }

    public WindowToast(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.toast_type;
            if (num == null) {
                this.toast_type = DEFAULT_TOAST_TYPE;
            } else {
                this.toast_type = num;
            }
            String str = builder.toast_link;
            if (str == null) {
                this.toast_link = "";
            } else {
                this.toast_link = str;
            }
            String str2 = builder.toast_content;
            if (str2 == null) {
                this.toast_content = "";
                return;
            } else {
                this.toast_content = str2;
                return;
            }
        }
        this.toast_type = builder.toast_type;
        this.toast_link = builder.toast_link;
        this.toast_content = builder.toast_content;
    }
}
