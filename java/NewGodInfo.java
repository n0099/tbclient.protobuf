package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class NewGodInfo extends Message {
    public static final String DEFAULT_FIELD_NAME = "";
    public static final String DEFAULT_TYPE_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer field_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String field_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String type_name;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_FIELD_ID = 0;
    public static final Integer DEFAULT_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NewGodInfo> {
        public Integer field_id;
        public String field_name;
        public Integer status;
        public Integer type;
        public String type_name;

        public Builder() {
        }

        public Builder(NewGodInfo newGodInfo) {
            super(newGodInfo);
            if (newGodInfo == null) {
                return;
            }
            this.status = newGodInfo.status;
            this.field_id = newGodInfo.field_id;
            this.field_name = newGodInfo.field_name;
            this.type = newGodInfo.type;
            this.type_name = newGodInfo.type_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewGodInfo build(boolean z) {
            return new NewGodInfo(this, z);
        }
    }

    public NewGodInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Integer num2 = builder.field_id;
            if (num2 == null) {
                this.field_id = DEFAULT_FIELD_ID;
            } else {
                this.field_id = num2;
            }
            String str = builder.field_name;
            if (str == null) {
                this.field_name = "";
            } else {
                this.field_name = str;
            }
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num3;
            }
            String str2 = builder.type_name;
            if (str2 == null) {
                this.type_name = "";
                return;
            } else {
                this.type_name = str2;
                return;
            }
        }
        this.status = builder.status;
        this.field_id = builder.field_id;
        this.field_name = builder.field_name;
        this.type = builder.type;
        this.type_name = builder.type_name;
    }
}
