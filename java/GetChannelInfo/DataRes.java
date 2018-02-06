package tbclient.GetChannelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ChannelInfo;
import tbclient.VideoList;
/* loaded from: classes3.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_IS_GUEST = 0;
    @ProtoField(tag = 2)
    public final ChannelInfo channel;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_guest;
    @ProtoField(tag = 3)
    public final VideoList video;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_guest == null) {
                this.is_guest = DEFAULT_IS_GUEST;
            } else {
                this.is_guest = builder.is_guest;
            }
            this.channel = builder.channel;
            this.video = builder.video;
            return;
        }
        this.is_guest = builder.is_guest;
        this.channel = builder.channel;
        this.video = builder.video;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ChannelInfo channel;
        public Integer is_guest;
        public VideoList video;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.is_guest = dataRes.is_guest;
                this.channel = dataRes.channel;
                this.video = dataRes.video;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
