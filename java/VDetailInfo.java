package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class VDetailInfo extends Message {
    public static final String DEFAULT_DETAIL_INFO = "";
    public static final String DEFAULT_INTRO = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String detail_info;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long v_id;
    public static final Long DEFAULT_V_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;

    private VDetailInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.v_id == null) {
                this.v_id = DEFAULT_V_ID;
            } else {
                this.v_id = builder.v_id;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.detail_info == null) {
                this.detail_info = "";
                return;
            } else {
                this.detail_info = builder.detail_info;
                return;
            }
        }
        this.v_id = builder.v_id;
        this.user_id = builder.user_id;
        this.intro = builder.intro;
        this.detail_info = builder.detail_info;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<VDetailInfo> {
        public String detail_info;
        public String intro;
        public Long user_id;
        public Long v_id;

        public Builder() {
        }

        public Builder(VDetailInfo vDetailInfo) {
            super(vDetailInfo);
            if (vDetailInfo != null) {
                this.v_id = vDetailInfo.v_id;
                this.user_id = vDetailInfo.user_id;
                this.intro = vDetailInfo.intro;
                this.detail_info = vDetailInfo.detail_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VDetailInfo build(boolean z) {
            return new VDetailInfo(this, z);
        }
    }
}
