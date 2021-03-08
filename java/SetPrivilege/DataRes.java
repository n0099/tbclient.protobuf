package tbclient.SetPrivilege;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_FIELD_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String field_text;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.field_text == null) {
                this.field_text = "";
                return;
            } else {
                this.field_text = builder.field_text;
                return;
            }
        }
        this.field_text = builder.field_text;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String field_text;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.field_text = dataRes.field_text;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
