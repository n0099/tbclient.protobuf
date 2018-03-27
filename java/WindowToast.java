package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class WindowToast extends Message {
    public static final String DEFAULT_TOAST_LINK = "";
    public static final Integer DEFAULT_TOAST_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String toast_link;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer toast_type;

    private WindowToast(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.toast_type == null) {
                this.toast_type = DEFAULT_TOAST_TYPE;
            } else {
                this.toast_type = builder.toast_type;
            }
            if (builder.toast_link == null) {
                this.toast_link = "";
                return;
            } else {
                this.toast_link = builder.toast_link;
                return;
            }
        }
        this.toast_type = builder.toast_type;
        this.toast_link = builder.toast_link;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<WindowToast> {
        public String toast_link;
        public Integer toast_type;

        public Builder() {
        }

        public Builder(WindowToast windowToast) {
            super(windowToast);
            if (windowToast != null) {
                this.toast_type = windowToast.toast_type;
                this.toast_link = windowToast.toast_link;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WindowToast build(boolean z) {
            return new WindowToast(this, z);
        }
    }
}
