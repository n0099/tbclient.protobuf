package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class AppealInfo extends Message {
    public static final String DEFAULT_APPEAL_URL = "";
    public static final String DEFAULT_SOURCE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String appeal_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String source;

    private AppealInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.source == null) {
                this.source = "";
            } else {
                this.source = builder.source;
            }
            if (builder.appeal_url == null) {
                this.appeal_url = "";
                return;
            } else {
                this.appeal_url = builder.appeal_url;
                return;
            }
        }
        this.source = builder.source;
        this.appeal_url = builder.appeal_url;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<AppealInfo> {
        public String appeal_url;
        public String source;

        public Builder() {
        }

        public Builder(AppealInfo appealInfo) {
            super(appealInfo);
            if (appealInfo != null) {
                this.source = appealInfo.source;
                this.appeal_url = appealInfo.appeal_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppealInfo build(boolean z) {
            return new AppealInfo(this, z);
        }
    }
}
