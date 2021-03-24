package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AppealInfo extends Message {
    public static final String DEFAULT_APPEAL_URL = "";
    public static final String DEFAULT_SOURCE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String appeal_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String source;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AppealInfo> {
        public String appeal_url;
        public String source;

        public Builder() {
        }

        public Builder(AppealInfo appealInfo) {
            super(appealInfo);
            if (appealInfo == null) {
                return;
            }
            this.source = appealInfo.source;
            this.appeal_url = appealInfo.appeal_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppealInfo build(boolean z) {
            return new AppealInfo(this, z);
        }
    }

    public AppealInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.source;
            if (str == null) {
                this.source = "";
            } else {
                this.source = str;
            }
            String str2 = builder.appeal_url;
            if (str2 == null) {
                this.appeal_url = "";
                return;
            } else {
                this.appeal_url = str2;
                return;
            }
        }
        this.source = builder.source;
        this.appeal_url = builder.appeal_url;
    }
}
