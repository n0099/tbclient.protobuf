package tbclient.SlotMachineRank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class SmRankItem extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer user_level;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer win;
    public static final Integer DEFAULT_USER_LEVEL = 0;
    public static final Integer DEFAULT_WIN = 0;
    public static final Long DEFAULT_USER_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SmRankItem> {
        public String portrait;
        public Long user_id;
        public Integer user_level;
        public String user_name;
        public Integer win;

        public Builder() {
        }

        public Builder(SmRankItem smRankItem) {
            super(smRankItem);
            if (smRankItem == null) {
                return;
            }
            this.portrait = smRankItem.portrait;
            this.user_level = smRankItem.user_level;
            this.user_name = smRankItem.user_name;
            this.win = smRankItem.win;
            this.user_id = smRankItem.user_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SmRankItem build(boolean z) {
            return new SmRankItem(this, z);
        }
    }

    public SmRankItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            Integer num = builder.user_level;
            if (num == null) {
                this.user_level = DEFAULT_USER_LEVEL;
            } else {
                this.user_level = num;
            }
            String str2 = builder.user_name;
            if (str2 == null) {
                this.user_name = "";
            } else {
                this.user_name = str2;
            }
            Integer num2 = builder.win;
            if (num2 == null) {
                this.win = DEFAULT_WIN;
            } else {
                this.win = num2;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = l;
                return;
            }
        }
        this.portrait = builder.portrait;
        this.user_level = builder.user_level;
        this.user_name = builder.user_name;
        this.win = builder.win;
        this.user_id = builder.user_id;
    }
}
