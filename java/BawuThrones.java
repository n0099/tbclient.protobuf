package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BawuThrones extends Message {
    public static final String DEFAULT_BAZHU_LEVEL = "";
    public static final Integer DEFAULT_TOTAL_RECOMMEND_NUM = 0;
    public static final Integer DEFAULT_USED_RECOMMEND_NUM = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bazhu_level;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer total_recommend_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer used_recommend_num;

    private BawuThrones(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.total_recommend_num == null) {
                this.total_recommend_num = DEFAULT_TOTAL_RECOMMEND_NUM;
            } else {
                this.total_recommend_num = builder.total_recommend_num;
            }
            if (builder.used_recommend_num == null) {
                this.used_recommend_num = DEFAULT_USED_RECOMMEND_NUM;
            } else {
                this.used_recommend_num = builder.used_recommend_num;
            }
            if (builder.bazhu_level == null) {
                this.bazhu_level = "";
                return;
            } else {
                this.bazhu_level = builder.bazhu_level;
                return;
            }
        }
        this.total_recommend_num = builder.total_recommend_num;
        this.used_recommend_num = builder.used_recommend_num;
        this.bazhu_level = builder.bazhu_level;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BawuThrones> {
        public String bazhu_level;
        public Integer total_recommend_num;
        public Integer used_recommend_num;

        public Builder() {
        }

        public Builder(BawuThrones bawuThrones) {
            super(bawuThrones);
            if (bawuThrones != null) {
                this.total_recommend_num = bawuThrones.total_recommend_num;
                this.used_recommend_num = bawuThrones.used_recommend_num;
                this.bazhu_level = bawuThrones.bazhu_level;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuThrones build(boolean z) {
            return new BawuThrones(this, z);
        }
    }
}
