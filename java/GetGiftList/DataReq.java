package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_BENEFIT_USERID = 0L;
    public static final String DEFAULT_SCENE_FROM = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long benefit_userid;
    @ProtoField(tag = 2)
    public final CommonReq common;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String scene_from;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.scene_from == null) {
                this.scene_from = "";
            } else {
                this.scene_from = builder.scene_from;
            }
            this.common = builder.common;
            if (builder.benefit_userid == null) {
                this.benefit_userid = DEFAULT_BENEFIT_USERID;
                return;
            } else {
                this.benefit_userid = builder.benefit_userid;
                return;
            }
        }
        this.scene_from = builder.scene_from;
        this.common = builder.common;
        this.benefit_userid = builder.benefit_userid;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long benefit_userid;
        public CommonReq common;
        public String scene_from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.scene_from = dataReq.scene_from;
                this.common = dataReq.common;
                this.benefit_userid = dataReq.benefit_userid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
