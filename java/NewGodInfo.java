package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class NewGodInfo extends Message {
    public static final String DEFAULT_FIELD_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer field_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String field_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer status;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_FIELD_ID = 0;

    private NewGodInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = builder.status;
            }
            if (builder.field_id == null) {
                this.field_id = DEFAULT_FIELD_ID;
            } else {
                this.field_id = builder.field_id;
            }
            if (builder.field_name == null) {
                this.field_name = "";
                return;
            } else {
                this.field_name = builder.field_name;
                return;
            }
        }
        this.status = builder.status;
        this.field_id = builder.field_id;
        this.field_name = builder.field_name;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NewGodInfo> {
        public Integer field_id;
        public String field_name;
        public Integer status;

        public Builder() {
        }

        public Builder(NewGodInfo newGodInfo) {
            super(newGodInfo);
            if (newGodInfo != null) {
                this.status = newGodInfo.status;
                this.field_id = newGodInfo.field_id;
                this.field_name = newGodInfo.field_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewGodInfo build(boolean z) {
            return new NewGodInfo(this, z);
        }
    }
}
