package tbclient.CheckPost;

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
/* loaded from: classes10.dex */
public final class ResData extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FNAME = "";
    public static final Long DEFAULT_FORUMID;
    public static final Long DEFAULT_POSTSTATE;
    public static final Long DEFAULT_QUOTEID;
    public static final Long DEFAULT_REPOSTID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forumId;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long postState;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long quoteId;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long repostId;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String fname;
        public Long forumId;
        public Long postState;
        public Long quoteId;
        public Long repostId;

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
        public Builder(ResData resData) {
            super(resData);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {resData};
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
            if (resData == null) {
                return;
            }
            this.postState = resData.postState;
            this.forumId = resData.forumId;
            this.quoteId = resData.quoteId;
            this.repostId = resData.repostId;
            this.fname = resData.fname;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ResData(this, z, null) : (ResData) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(867748866, "Ltbclient/CheckPost/ResData;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(867748866, "Ltbclient/CheckPost/ResData;");
                return;
            }
        }
        DEFAULT_POSTSTATE = 0L;
        DEFAULT_FORUMID = 0L;
        DEFAULT_QUOTEID = 0L;
        DEFAULT_REPOSTID = 0L;
    }

    public /* synthetic */ ResData(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResData(Builder builder, boolean z) {
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
            Long l = builder.postState;
            if (l == null) {
                this.postState = DEFAULT_POSTSTATE;
            } else {
                this.postState = l;
            }
            Long l2 = builder.forumId;
            if (l2 == null) {
                this.forumId = DEFAULT_FORUMID;
            } else {
                this.forumId = l2;
            }
            Long l3 = builder.quoteId;
            if (l3 == null) {
                this.quoteId = DEFAULT_QUOTEID;
            } else {
                this.quoteId = l3;
            }
            Long l4 = builder.repostId;
            if (l4 == null) {
                this.repostId = DEFAULT_REPOSTID;
            } else {
                this.repostId = l4;
            }
            String str = builder.fname;
            if (str == null) {
                this.fname = "";
                return;
            } else {
                this.fname = str;
                return;
            }
        }
        this.postState = builder.postState;
        this.forumId = builder.forumId;
        this.quoteId = builder.quoteId;
        this.repostId = builder.repostId;
        this.fname = builder.fname;
    }
}
