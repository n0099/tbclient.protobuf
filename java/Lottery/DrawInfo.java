package tbclient.Lottery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class DrawInfo extends Message {
    public static final String DEFAULT_AWARD_DES = "";
    public static final String DEFAULT_AWARD_IMGSRC = "";
    public static final String DEFAULT_BSIZE = "";
    public static final String DEFAULT_LINK = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String award_des;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long award_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String award_imgsrc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bsize;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer draw_res_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link;
    public static final Integer DEFAULT_DRAW_RES_TYPE = 0;
    public static final Long DEFAULT_AWARD_ID = 0L;

    private DrawInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.draw_res_type == null) {
                this.draw_res_type = DEFAULT_DRAW_RES_TYPE;
            } else {
                this.draw_res_type = builder.draw_res_type;
            }
            if (builder.link == null) {
                this.link = "";
            } else {
                this.link = builder.link;
            }
            if (builder.award_imgsrc == null) {
                this.award_imgsrc = "";
            } else {
                this.award_imgsrc = builder.award_imgsrc;
            }
            if (builder.bsize == null) {
                this.bsize = "";
            } else {
                this.bsize = builder.bsize;
            }
            if (builder.award_des == null) {
                this.award_des = "";
            } else {
                this.award_des = builder.award_des;
            }
            if (builder.award_id == null) {
                this.award_id = DEFAULT_AWARD_ID;
                return;
            } else {
                this.award_id = builder.award_id;
                return;
            }
        }
        this.draw_res_type = builder.draw_res_type;
        this.link = builder.link;
        this.award_imgsrc = builder.award_imgsrc;
        this.bsize = builder.bsize;
        this.award_des = builder.award_des;
        this.award_id = builder.award_id;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DrawInfo> {
        public String award_des;
        public Long award_id;
        public String award_imgsrc;
        public String bsize;
        public Integer draw_res_type;
        public String link;

        public Builder() {
        }

        public Builder(DrawInfo drawInfo) {
            super(drawInfo);
            if (drawInfo != null) {
                this.draw_res_type = drawInfo.draw_res_type;
                this.link = drawInfo.link;
                this.award_imgsrc = drawInfo.award_imgsrc;
                this.bsize = drawInfo.bsize;
                this.award_des = drawInfo.award_des;
                this.award_id = drawInfo.award_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DrawInfo build(boolean z) {
            return new DrawInfo(this, z);
        }
    }
}
