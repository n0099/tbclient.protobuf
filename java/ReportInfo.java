package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ReportInfo extends Message {
    public static final String DEFAULT_INFO = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ReportInfo> {
        public String info;
        public String url;

        public Builder() {
        }

        public Builder(ReportInfo reportInfo) {
            super(reportInfo);
            if (reportInfo == null) {
                return;
            }
            this.info = reportInfo.info;
            this.url = reportInfo.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReportInfo build(boolean z) {
            return new ReportInfo(this, z);
        }
    }

    public ReportInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.info;
            if (str == null) {
                this.info = "";
            } else {
                this.info = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.info = builder.info;
        this.url = builder.url;
    }
}
