package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class AdCloseInfo extends Message {
    public static final String DEFAULT_CONFIRM_TITLE = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 5)
    public final ActionControl action_control;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String confirm_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> reasons;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer support_close;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_SUPPORT_CLOSE = 0;
    public static final List<String> DEFAULT_REASONS = Collections.emptyList();

    private AdCloseInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.support_close == null) {
                this.support_close = DEFAULT_SUPPORT_CLOSE;
            } else {
                this.support_close = builder.support_close;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.reasons == null) {
                this.reasons = DEFAULT_REASONS;
            } else {
                this.reasons = immutableCopyOf(builder.reasons);
            }
            if (builder.confirm_title == null) {
                this.confirm_title = "";
            } else {
                this.confirm_title = builder.confirm_title;
            }
            this.action_control = builder.action_control;
            return;
        }
        this.support_close = builder.support_close;
        this.title = builder.title;
        this.reasons = immutableCopyOf(builder.reasons);
        this.confirm_title = builder.confirm_title;
        this.action_control = builder.action_control;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AdCloseInfo> {
        public ActionControl action_control;
        public String confirm_title;
        public List<String> reasons;
        public Integer support_close;
        public String title;

        public Builder() {
        }

        public Builder(AdCloseInfo adCloseInfo) {
            super(adCloseInfo);
            if (adCloseInfo != null) {
                this.support_close = adCloseInfo.support_close;
                this.title = adCloseInfo.title;
                this.reasons = AdCloseInfo.copyOf(adCloseInfo.reasons);
                this.confirm_title = adCloseInfo.confirm_title;
                this.action_control = adCloseInfo.action_control;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdCloseInfo build(boolean z) {
            return new AdCloseInfo(this, z);
        }
    }
}
