package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AppTransmitData extends Message {
    public static final String DEFAULT_WISE_SAMPLE_ID = "";
    public static final String DEFAULT_YY_HDID = "";
    public static final String DEFAULT_YY_VERSION = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String wise_sample_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String yy_hdid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String yy_version;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AppTransmitData> {
        public String wise_sample_id;
        public String yy_hdid;
        public String yy_version;

        public Builder() {
        }

        public Builder(AppTransmitData appTransmitData) {
            super(appTransmitData);
            if (appTransmitData == null) {
                return;
            }
            this.wise_sample_id = appTransmitData.wise_sample_id;
            this.yy_hdid = appTransmitData.yy_hdid;
            this.yy_version = appTransmitData.yy_version;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppTransmitData build(boolean z) {
            return new AppTransmitData(this, z);
        }
    }

    public AppTransmitData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.wise_sample_id;
            if (str == null) {
                this.wise_sample_id = "";
            } else {
                this.wise_sample_id = str;
            }
            String str2 = builder.yy_hdid;
            if (str2 == null) {
                this.yy_hdid = "";
            } else {
                this.yy_hdid = str2;
            }
            String str3 = builder.yy_version;
            if (str3 == null) {
                this.yy_version = "";
                return;
            } else {
                this.yy_version = str3;
                return;
            }
        }
        this.wise_sample_id = builder.wise_sample_id;
        this.yy_hdid = builder.yy_hdid;
        this.yy_version = builder.yy_version;
    }
}
