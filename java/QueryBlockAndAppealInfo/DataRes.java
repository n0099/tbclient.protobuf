package tbclient.QueryBlockAndAppealInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_AHEAD_INFO = "";
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_BLOCK_ID_CODE = "";
    public static final String DEFAULT_BLOCK_INFO = "";
    public static final String DEFAULT_OK_INFO = "";
    public static final Integer DEFAULT_WIN_TYPE = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ahead_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String block_id_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String block_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ok_info;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer win_type;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.block_info == null) {
                this.block_info = "";
            } else {
                this.block_info = builder.block_info;
            }
            if (builder.ahead_info == null) {
                this.ahead_info = "";
            } else {
                this.ahead_info = builder.ahead_info;
            }
            if (builder.ahead_url == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = builder.ahead_url;
            }
            if (builder.ok_info == null) {
                this.ok_info = "";
            } else {
                this.ok_info = builder.ok_info;
            }
            if (builder.block_id_code == null) {
                this.block_id_code = "";
            } else {
                this.block_id_code = builder.block_id_code;
            }
            if (builder.win_type == null) {
                this.win_type = DEFAULT_WIN_TYPE;
                return;
            } else {
                this.win_type = builder.win_type;
                return;
            }
        }
        this.block_info = builder.block_info;
        this.ahead_info = builder.ahead_info;
        this.ahead_url = builder.ahead_url;
        this.ok_info = builder.ok_info;
        this.block_id_code = builder.block_id_code;
        this.win_type = builder.win_type;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String ahead_info;
        public String ahead_url;
        public String block_id_code;
        public String block_info;
        public String ok_info;
        public Integer win_type;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.block_info = dataRes.block_info;
                this.ahead_info = dataRes.ahead_info;
                this.ahead_url = dataRes.ahead_url;
                this.ok_info = dataRes.ok_info;
                this.block_id_code = dataRes.block_id_code;
                this.win_type = dataRes.win_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
