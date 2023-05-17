package tbclient.GetReportType;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ReportType extends Message {
    public static final Integer DEFAULT_TYPE_ID = 0;
    public static final String DEFAULT_TYPE_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String type_text;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ReportType> {
        public Integer type_id;
        public String type_text;

        public Builder() {
        }

        public Builder(ReportType reportType) {
            super(reportType);
            if (reportType == null) {
                return;
            }
            this.type_id = reportType.type_id;
            this.type_text = reportType.type_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReportType build(boolean z) {
            return new ReportType(this, z);
        }
    }

    public ReportType(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type_id;
            if (num == null) {
                this.type_id = DEFAULT_TYPE_ID;
            } else {
                this.type_id = num;
            }
            String str = builder.type_text;
            if (str == null) {
                this.type_text = "";
                return;
            } else {
                this.type_text = str;
                return;
            }
        }
        this.type_id = builder.type_id;
        this.type_text = builder.type_text;
    }
}
