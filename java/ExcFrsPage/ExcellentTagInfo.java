package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class ExcellentTagInfo extends Message {
    public static final Long DEFAULT_TAG_CODE = 0L;
    public static final String DEFAULT_TAG_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tag_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tag_name;

    private ExcellentTagInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tag_code == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = builder.tag_code;
            }
            if (builder.tag_name == null) {
                this.tag_name = "";
                return;
            } else {
                this.tag_name = builder.tag_name;
                return;
            }
        }
        this.tag_code = builder.tag_code;
        this.tag_name = builder.tag_name;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<ExcellentTagInfo> {
        public Long tag_code;
        public String tag_name;

        public Builder() {
        }

        public Builder(ExcellentTagInfo excellentTagInfo) {
            super(excellentTagInfo);
            if (excellentTagInfo != null) {
                this.tag_code = excellentTagInfo.tag_code;
                this.tag_name = excellentTagInfo.tag_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcellentTagInfo build(boolean z) {
            return new ExcellentTagInfo(this, z);
        }
    }
}
