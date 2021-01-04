package tbclient.GetGameDetailNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class CodeInfo extends Message {
    public static final String DEFAULT_GAME_CODE = "";
    public static final String DEFAULT_GIFT_CODE = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer code_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer code_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String game_code;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String gift_code;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer kaifu_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer user_status;
    public static final Integer DEFAULT_USER_STATUS = 0;
    public static final Integer DEFAULT_CODE_STATUS = 0;
    public static final Integer DEFAULT_KAIFU_ID = 0;
    public static final Integer DEFAULT_CODE_TYPE = 0;

    private CodeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_status == null) {
                this.user_status = DEFAULT_USER_STATUS;
            } else {
                this.user_status = builder.user_status;
            }
            if (builder.code_status == null) {
                this.code_status = DEFAULT_CODE_STATUS;
            } else {
                this.code_status = builder.code_status;
            }
            if (builder.kaifu_id == null) {
                this.kaifu_id = DEFAULT_KAIFU_ID;
            } else {
                this.kaifu_id = builder.kaifu_id;
            }
            if (builder.code_type == null) {
                this.code_type = DEFAULT_CODE_TYPE;
            } else {
                this.code_type = builder.code_type;
            }
            if (builder.gift_code == null) {
                this.gift_code = "";
            } else {
                this.gift_code = builder.gift_code;
            }
            if (builder.game_code == null) {
                this.game_code = "";
                return;
            } else {
                this.game_code = builder.game_code;
                return;
            }
        }
        this.user_status = builder.user_status;
        this.code_status = builder.code_status;
        this.kaifu_id = builder.kaifu_id;
        this.code_type = builder.code_type;
        this.gift_code = builder.gift_code;
        this.game_code = builder.game_code;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<CodeInfo> {
        public Integer code_status;
        public Integer code_type;
        public String game_code;
        public String gift_code;
        public Integer kaifu_id;
        public Integer user_status;

        public Builder() {
        }

        public Builder(CodeInfo codeInfo) {
            super(codeInfo);
            if (codeInfo != null) {
                this.user_status = codeInfo.user_status;
                this.code_status = codeInfo.code_status;
                this.kaifu_id = codeInfo.kaifu_id;
                this.code_type = codeInfo.code_type;
                this.gift_code = codeInfo.gift_code;
                this.game_code = codeInfo.game_code;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CodeInfo build(boolean z) {
            return new CodeInfo(this, z);
        }
    }
}
