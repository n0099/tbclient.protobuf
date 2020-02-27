package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes13.dex */
public final class RankItem extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long grade;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_GRADE = 0L;

    private RankItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.grade == null) {
                this.grade = DEFAULT_GRADE;
                return;
            } else {
                this.grade = builder.grade;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.grade = builder.grade;
    }

    /* loaded from: classes13.dex */
    public static final class Builder extends Message.Builder<RankItem> {
        public Long grade;
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(RankItem rankItem) {
            super(rankItem);
            if (rankItem != null) {
                this.user_id = rankItem.user_id;
                this.user_name = rankItem.user_name;
                this.portrait = rankItem.portrait;
                this.grade = rankItem.grade;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RankItem build(boolean z) {
            return new RankItem(this, z);
        }
    }
}
