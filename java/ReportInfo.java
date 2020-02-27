package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ReportInfo extends Message {
    public static final String DEFAULT_INFO = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private ReportInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.info == null) {
                this.info = "";
            } else {
                this.info = builder.info;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.info = builder.info;
        this.url = builder.url;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ReportInfo> {
        public String info;
        public String url;

        public Builder() {
        }

        public Builder(ReportInfo reportInfo) {
            super(reportInfo);
            if (reportInfo != null) {
                this.info = reportInfo.info;
                this.url = reportInfo.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReportInfo build(boolean z) {
            return new ReportInfo(this, z);
        }
    }
}
