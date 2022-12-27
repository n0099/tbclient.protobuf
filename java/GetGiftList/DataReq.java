package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SCENE_FROM = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long benefit_userid;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1221common;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String scene_from;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer show_draw_gift;
    public static final Long DEFAULT_BENEFIT_USERID = 0L;
    public static final Integer DEFAULT_SHOW_DRAW_GIFT = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long benefit_userid;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1222common;
        public String scene_from;
        public Integer show_draw_gift;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.scene_from = dataReq.scene_from;
            this.f1222common = dataReq.f1221common;
            this.benefit_userid = dataReq.benefit_userid;
            this.show_draw_gift = dataReq.show_draw_gift;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.scene_from;
            if (str == null) {
                this.scene_from = "";
            } else {
                this.scene_from = str;
            }
            this.f1221common = builder.f1222common;
            Long l = builder.benefit_userid;
            if (l == null) {
                this.benefit_userid = DEFAULT_BENEFIT_USERID;
            } else {
                this.benefit_userid = l;
            }
            Integer num = builder.show_draw_gift;
            if (num == null) {
                this.show_draw_gift = DEFAULT_SHOW_DRAW_GIFT;
                return;
            } else {
                this.show_draw_gift = num;
                return;
            }
        }
        this.scene_from = builder.scene_from;
        this.f1221common = builder.f1222common;
        this.benefit_userid = builder.benefit_userid;
        this.show_draw_gift = builder.show_draw_gift;
    }
}
