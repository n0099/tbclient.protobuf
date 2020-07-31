package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class AdParam extends Message {
    public static final String DEFAULT_YOGA_LIB_VERSION = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_req_ad;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer load_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer refresh_count;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String yoga_lib_version;
    public static final Integer DEFAULT_LOAD_COUNT = 0;
    public static final Integer DEFAULT_REFRESH_COUNT = 0;
    public static final Integer DEFAULT_IS_REQ_AD = 0;

    private AdParam(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.load_count == null) {
                this.load_count = DEFAULT_LOAD_COUNT;
            } else {
                this.load_count = builder.load_count;
            }
            if (builder.refresh_count == null) {
                this.refresh_count = DEFAULT_REFRESH_COUNT;
            } else {
                this.refresh_count = builder.refresh_count;
            }
            if (builder.yoga_lib_version == null) {
                this.yoga_lib_version = "";
            } else {
                this.yoga_lib_version = builder.yoga_lib_version;
            }
            if (builder.is_req_ad == null) {
                this.is_req_ad = DEFAULT_IS_REQ_AD;
                return;
            } else {
                this.is_req_ad = builder.is_req_ad;
                return;
            }
        }
        this.load_count = builder.load_count;
        this.refresh_count = builder.refresh_count;
        this.yoga_lib_version = builder.yoga_lib_version;
        this.is_req_ad = builder.is_req_ad;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<AdParam> {
        public Integer is_req_ad;
        public Integer load_count;
        public Integer refresh_count;
        public String yoga_lib_version;

        public Builder() {
        }

        public Builder(AdParam adParam) {
            super(adParam);
            if (adParam != null) {
                this.load_count = adParam.load_count;
                this.refresh_count = adParam.refresh_count;
                this.yoga_lib_version = adParam.yoga_lib_version;
                this.is_req_ad = adParam.is_req_ad;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdParam build(boolean z) {
            return new AdParam(this, z);
        }
    }
}
