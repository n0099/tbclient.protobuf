package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class MyGroupInfo extends Message {
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final String DEFAULT_GROUP_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long group_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String group_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;

    /* synthetic */ MyGroupInfo(Builder builder, boolean z, MyGroupInfo myGroupInfo) {
        this(builder, z);
    }

    private MyGroupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.group_id == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = builder.group_id;
            }
            if (builder.group_name == null) {
                this.group_name = "";
            } else {
                this.group_name = builder.group_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = builder.portrait;
                return;
            }
        }
        this.group_id = builder.group_id;
        this.group_name = builder.group_name;
        this.portrait = builder.portrait;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<MyGroupInfo> {
        public Long group_id;
        public String group_name;
        public String portrait;

        public Builder() {
        }

        public Builder(MyGroupInfo myGroupInfo) {
            super(myGroupInfo);
            if (myGroupInfo != null) {
                this.group_id = myGroupInfo.group_id;
                this.group_name = myGroupInfo.group_name;
                this.portrait = myGroupInfo.portrait;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MyGroupInfo build(boolean z) {
            return new MyGroupInfo(this, z, null);
        }
    }
}
