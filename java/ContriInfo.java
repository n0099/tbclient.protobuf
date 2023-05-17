package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class ContriInfo extends Message {
    public static final String DEFAULT_AFTER_MSG = "";
    public static final String DEFAULT_COLOR_MSG = "";
    public static final List<ToastConfig> DEFAULT_TOAST_CONFIG = Collections.emptyList();
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String after_msg;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String color_msg;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ToastConfig> toast_config;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ContriInfo> {
        public String after_msg;
        public String color_msg;
        public List<ToastConfig> toast_config;

        public Builder() {
        }

        public Builder(ContriInfo contriInfo) {
            super(contriInfo);
            if (contriInfo == null) {
                return;
            }
            this.color_msg = contriInfo.color_msg;
            this.after_msg = contriInfo.after_msg;
            this.toast_config = Message.copyOf(contriInfo.toast_config);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ContriInfo build(boolean z) {
            return new ContriInfo(this, z);
        }
    }

    public ContriInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.color_msg;
            if (str == null) {
                this.color_msg = "";
            } else {
                this.color_msg = str;
            }
            String str2 = builder.after_msg;
            if (str2 == null) {
                this.after_msg = "";
            } else {
                this.after_msg = str2;
            }
            List<ToastConfig> list = builder.toast_config;
            if (list == null) {
                this.toast_config = DEFAULT_TOAST_CONFIG;
                return;
            } else {
                this.toast_config = Message.immutableCopyOf(list);
                return;
            }
        }
        this.color_msg = builder.color_msg;
        this.after_msg = builder.after_msg;
        this.toast_config = Message.immutableCopyOf(builder.toast_config);
    }
}
