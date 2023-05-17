package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class PkModule extends Message {
    public static final String DEFAULT_MODULE_NAME = "";
    public static final String DEFAULT_QUES_DESC = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 3)
    public final PkView pk_1;
    @ProtoField(tag = 4)
    public final PkView pk_2;
    @ProtoField(tag = 5)
    public final PkView pk_3;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long pk_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer pk_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ques_desc;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long user_pk_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer user_pk_index;
    public static final Integer DEFAULT_PK_TYPE = 0;
    public static final Integer DEFAULT_USER_PK_INDEX = 0;
    public static final Long DEFAULT_PK_ID = 0L;
    public static final Long DEFAULT_USER_PK_ID = 0L;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PkModule> {
        public String module_name;
        public PkView pk_1;
        public PkView pk_2;
        public PkView pk_3;
        public Long pk_id;
        public Integer pk_type;
        public String ques_desc;
        public Long user_pk_id;
        public Integer user_pk_index;

        public Builder() {
        }

        public Builder(PkModule pkModule) {
            super(pkModule);
            if (pkModule == null) {
                return;
            }
            this.module_name = pkModule.module_name;
            this.ques_desc = pkModule.ques_desc;
            this.pk_1 = pkModule.pk_1;
            this.pk_2 = pkModule.pk_2;
            this.pk_3 = pkModule.pk_3;
            this.pk_type = pkModule.pk_type;
            this.user_pk_index = pkModule.user_pk_index;
            this.pk_id = pkModule.pk_id;
            this.user_pk_id = pkModule.user_pk_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkModule build(boolean z) {
            return new PkModule(this, z);
        }
    }

    public PkModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.module_name;
            if (str == null) {
                this.module_name = "";
            } else {
                this.module_name = str;
            }
            String str2 = builder.ques_desc;
            if (str2 == null) {
                this.ques_desc = "";
            } else {
                this.ques_desc = str2;
            }
            this.pk_1 = builder.pk_1;
            this.pk_2 = builder.pk_2;
            this.pk_3 = builder.pk_3;
            Integer num = builder.pk_type;
            if (num == null) {
                this.pk_type = DEFAULT_PK_TYPE;
            } else {
                this.pk_type = num;
            }
            Integer num2 = builder.user_pk_index;
            if (num2 == null) {
                this.user_pk_index = DEFAULT_USER_PK_INDEX;
            } else {
                this.user_pk_index = num2;
            }
            Long l = builder.pk_id;
            if (l == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = l;
            }
            Long l2 = builder.user_pk_id;
            if (l2 == null) {
                this.user_pk_id = DEFAULT_USER_PK_ID;
                return;
            } else {
                this.user_pk_id = l2;
                return;
            }
        }
        this.module_name = builder.module_name;
        this.ques_desc = builder.ques_desc;
        this.pk_1 = builder.pk_1;
        this.pk_2 = builder.pk_2;
        this.pk_3 = builder.pk_3;
        this.pk_type = builder.pk_type;
        this.user_pk_index = builder.user_pk_index;
        this.pk_id = builder.pk_id;
        this.user_pk_id = builder.user_pk_id;
    }
}
