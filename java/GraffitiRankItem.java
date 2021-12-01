package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class GraffitiRankItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_GID;
    public static final Integer DEFAULT_G_TYPE;
    public static final Integer DEFAULT_IS_VOTE;
    public static final String DEFAULT_PIC_ID = "";
    public static final String DEFAULT_THUMB_URL = "";
    public static final Long DEFAULT_UID;
    public static final String DEFAULT_URL = "";
    public static final Long DEFAULT_VOTE_COUNT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer g_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long gid;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_vote;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String pic_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String thumb_url;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long vote_count;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GraffitiRankItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer g_type;
        public Long gid;
        public Integer is_vote;
        public String pic_id;
        public String thumb_url;
        public Long uid;
        public String url;
        public Long vote_count;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(GraffitiRankItem graffitiRankItem) {
            super(graffitiRankItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {graffitiRankItem};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (graffitiRankItem == null) {
                return;
            }
            this.gid = graffitiRankItem.gid;
            this.url = graffitiRankItem.url;
            this.vote_count = graffitiRankItem.vote_count;
            this.is_vote = graffitiRankItem.is_vote;
            this.uid = graffitiRankItem.uid;
            this.pic_id = graffitiRankItem.pic_id;
            this.g_type = graffitiRankItem.g_type;
            this.thumb_url = graffitiRankItem.thumb_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GraffitiRankItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GraffitiRankItem(this, z, null) : (GraffitiRankItem) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(833201962, "Ltbclient/GraffitiRankItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(833201962, "Ltbclient/GraffitiRankItem;");
                return;
            }
        }
        DEFAULT_GID = 0L;
        DEFAULT_VOTE_COUNT = 0L;
        DEFAULT_IS_VOTE = 0;
        DEFAULT_UID = 0L;
        DEFAULT_G_TYPE = 0;
    }

    public /* synthetic */ GraffitiRankItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraffitiRankItem(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.gid;
            if (l == null) {
                this.gid = DEFAULT_GID;
            } else {
                this.gid = l;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            Long l2 = builder.vote_count;
            if (l2 == null) {
                this.vote_count = DEFAULT_VOTE_COUNT;
            } else {
                this.vote_count = l2;
            }
            Integer num = builder.is_vote;
            if (num == null) {
                this.is_vote = DEFAULT_IS_VOTE;
            } else {
                this.is_vote = num;
            }
            Long l3 = builder.uid;
            if (l3 == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l3;
            }
            String str2 = builder.pic_id;
            if (str2 == null) {
                this.pic_id = "";
            } else {
                this.pic_id = str2;
            }
            Integer num2 = builder.g_type;
            if (num2 == null) {
                this.g_type = DEFAULT_G_TYPE;
            } else {
                this.g_type = num2;
            }
            String str3 = builder.thumb_url;
            if (str3 == null) {
                this.thumb_url = "";
                return;
            } else {
                this.thumb_url = str3;
                return;
            }
        }
        this.gid = builder.gid;
        this.url = builder.url;
        this.vote_count = builder.vote_count;
        this.is_vote = builder.is_vote;
        this.uid = builder.uid;
        this.pic_id = builder.pic_id;
        this.g_type = builder.g_type;
        this.thumb_url = builder.thumb_url;
    }
}
